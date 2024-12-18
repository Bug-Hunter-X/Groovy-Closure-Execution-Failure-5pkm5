```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  closure.call()
  println "After closure execution"
}

methodWithClosure { println "Inside closure" }

// Or, if you need to pass arguments to the closure:

def methodWithClosureArgs(closure, arg1, arg2) {
  println "Before closure execution"
  closure(arg1, arg2)
  println "After closure execution"
}

methodWithClosureArgs({arg1, arg2 -> println "Inside closure with args: $arg1, $arg2" }, "hello", "world")
```