# LOGS TUTORIAL

Installation instructions for:

- [Windows](#running-on-windows)
- [macOS/linux](#running-on-macos-linux)

## Running on Windows

### Pre-requisites

The following need to be installed on your system:

- [Git for Windows](https://git-scm.com/download/win)
- [Docker Desktop](https://www.docker.com/products/docker-desktop)
- [Java (64-bit)](https://cdn.azul.com/zulu/bin/zulu8.56.0.21-ca-jdk8.0.302-win_x64.msi) or [Java (32-bit)](https://cdn.azul.com/zulu/bin/zulu8.56.0.21-ca-jdk8.0.302-win_i686.msi)

### Clone this repository

After installing all of the above tools, open Windows PowerShell as Administrator and run the following commands:

```shell
git config --global core.autocrlf false
git clone https://github.com/kaushald/logging-tutorial.git
cd logging-tutorial
```

### Build and run the project

Using the same PowerShell as above, build the project using the following build script

```shell
.\bnd.bat
```


### Kibana

- [Open Kibana at this link](http://127.0.0.1:5601/) 

You can then view the logs here:

- [Kibana Discover Logs](<http://localhost:5601/app/discover#/?_g=(filters:!(),refreshInterval:(pause:!t,value:0),time:(from:now-30m,to:now))&_a=(columns:!(),filters:!(),index:'logs-*',interval:auto,query:(language:kuery,query:''),sort:!(!('@timestamp',desc)))>)

## Running on macOS/linux

### Pre-requisites

The following need to be installed on your system:

- [Docker Desktop](https://www.docker.com/products/docker-desktop)
- [Java (Intel Chip)](https://cdn.azul.com/zulu/bin/zulu8.56.0.21-ca-jdk8.0.302-macosx_x64.dmg) or [Java (Apple M1 Chip)](https://cdn.azul.com/zulu/bin/zulu8.56.0.23-ca-jdk8.0.302-macosx_aarch64.dmg)
- [Homebrew](https://brew.sh/)

### Clone this repository

After installing all of the above tools, open a terminal and run the following commands:

```shell
git clone https://github.com/kaushald/logging-tutorial.git
cd logging-tutorial
```

### Build and run the project

Using the same terminal as above, build the project using the following build script

```shell
./bnd.sh
```

### Build and run the project (K6 Load Tests)

#### Install K6

```shell
brew install k6
```


#### Run K6 Load Tests

You can then run the load tests with the following commands -

- A simple test that calls the transport API

```shell
k6 run k6/test.js
```

### Kibana

- [Open Kibana at this link](http://127.0.0.1:5601/)

You can then view the logs here:

- [Kibana Discover Logs](<http://localhost:5601/app/discover#/?_g=(filters:!(),refreshInterval:(pause:!t,value:0),time:(from:now-30m,to:now))&_a=(columns:!(),filters:!(),index:'logs-*',interval:auto,query:(language:kuery,query:''),sort:!(!('@timestamp',desc)))>)
