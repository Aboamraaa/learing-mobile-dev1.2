
fun main()
{
    print("enter your name: ")
    val name: String = readln()
    print("enter your nickname: ")
    var nickname: String = readln()
    if (nickname.isBlank()) {
        nickname = "unknown user"
    }
    print("enter your age: ")
    val age=readln().toIntOrNull() ?: 0
    val isadult : Boolean = age>=18
    if (isadult)
    {
    println("hello $nickname you are an adult")
    }
    else {
        println("hello $nickname you are a minor")
    return}
    print("welcome to our app")
}