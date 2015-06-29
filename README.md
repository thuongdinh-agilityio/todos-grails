# TODO by Grails
Example Todo application built by Grails framework

# Requirements

* [VirtualBox](https://www.virtualbox.org)
* [Vagrant](http://vagrantup.com)

Tested on VirtualBox 4.3.28 and Vagrant 1.7.1

# Installation

```bash
$ git clone https://github.com/thuongdinh/todos-grails.git
$ cd todos-grails
$ vagrant up
```

# Run demo app

```bash
$ vagrant ssh
$ cd todos
$ grails run-app
```

Open your browser and go to [http://192.168.222.222:8080/todos](http://192.168.222.222:8080/todos)
