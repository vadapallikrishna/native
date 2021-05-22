package config

import deploy.Task

class Container(name: String,deploy: () -> Array<Task>): Setup(){

}