# -*- mode: ruby -*-
# vi: set ft=ruby :

VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.box = "precise64"
  config.vm.box_url = "http://files.vagrantup.com/precise64.box"

  config.vm.network :forwarded_port, guest: 8080, host: 2323
  config.vm.network :private_network, ip: "192.168.222.222"

  config.vm.provider "virtualbox" do |v|
    v.memory = 1536
    v.cpus = 2
  end

  config.vm.synced_folder "todos", "/home/vagrant/todos"

  config.vm.provision :puppet, :module_path => "puppet/modules" do |puppet|
    puppet.manifests_path = "puppet/manifests"
    puppet.manifest_file  = "default.pp"
  end

  config.vm.provision :shell, :path => "bootstrap.sh"
end
