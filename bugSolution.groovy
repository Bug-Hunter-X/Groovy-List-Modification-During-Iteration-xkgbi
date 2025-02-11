```groovy
def someMethod() {
    def list = [1, 2, 3]
    def iterator = list.iterator()
    while (iterator.hasNext()) {
        def item = iterator.next()
        if (item == 2) {
            iterator.remove()
        }
    }
    println list
}
someMethod()

//Alternative solution using a new list
def someMethod2(){
  def list = [1,2,3]
  def newList = []
  list.each{item->
    if(item!=2){
      newList.add(item)
    }
  }
  println newList
}
someMethod2() 
```