import {SharedArray} from 'k6/data';
import {vu} from 'k6/execution';
import {check, sleep} from 'k6';
import http from 'k6/http';


const users = new SharedArray('users', function () {
    return JSON.parse(open('./data.json')).users;
});

export const options = {
    scenarios: {
        login: {
            executor: 'per-vu-iterations',
            vus: users.length,
            iterations: 50,
            maxDuration: '1h30m',
        },
    },
};

export default function () {
    // VU identifiers are one-based and arrays are zero-based, thus we need - 1
    console.log(`User ID: ${vu.idInTest - 1}, travelling from ${users[vu.idInTest - 1].from} to ${users[vu.idInTest - 1].to}`);
    const url = `http://localhost:8080/api/transportation?startingPoint=${users[vu.idInTest - 1].from}&destination=${users[vu.idInTest - 1].to}`;
    const params = {};
    check(http.get(url, params), {
        'status is 200': (r) => r.status === 200,
    }) || errorRate.add(1);
    sleep(0.5);
}
