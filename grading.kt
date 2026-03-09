
fun main()
{

    print("enter a number:")
    val grade= readln().toInt()
    when(grade)
    {
        in 90..100 ->print("A")
        in 80..90 ->print("B")
        in 70..80 ->print("C")
        in 60..70 ->print("D")
        in 0..60 ->print("needs work")
        else ->print("wrong input please recheck your grade")
        }
    }
