package com.demo

class DemoController {

    def index() { 
        [subClassInstance: new SubClass()]
    }
}
