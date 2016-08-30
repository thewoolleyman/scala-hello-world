val mylist = List(1,2,3,4)
val mysum = mylist.reduce((listElement, sum) => listElement + sum)
println(mysum)

val mysumfold = mylist.foldRight()