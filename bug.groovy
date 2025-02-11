```groovy
def someMethod() {
    def list = [1, 2, 3]
    list.eachWithIndex { item, index ->
        if (item == 2) {
            list.remove(index) //This is the problematic line
        }
    }
    println list
}
someMethod()
```