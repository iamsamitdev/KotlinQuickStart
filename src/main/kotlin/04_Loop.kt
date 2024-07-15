fun kLoop() {

    //หากต้องการพิมพ์เลขตั้งแต่ 1 - 10
    for (x in 1..10) {
        println(x)
    }

    println("-----------------")

    val min = 1
    val max = 100
    var count = 0
    for (x in min..max) {
        if(x % 3 == 0) {
            println(x)
            count++
        }
    }
    println("จาก $min - $max มีเลขที่ 3 หารลงตัวเท่ากับ $count จำนวน")

    println("-----------------")

    // กรณีที่ต้องการให้วนลูปจากค่าแรกไปจนถึง ก่อนค่าสุดท้าย ให้กำหนดช่วงข้อมูลด้วย until เช่น
    for (a in 0 until 100 step 10) {
        println(a)
    }

    println("-----------------")

    // ถ้าต้องการเรียงลำดับแบบย้อนกลับ ก็กำหนดช่วงข้อมูลด้วย downTo เช่น
    for (i in 10 downTo 1) {
        println(i)
    }

    println("-----------------")

    repeat (5) {
        println("Kotlin")
    }

    println("-----------------")
    // การใช้คำสั่ง break
    var sum = 0
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        sum += i // 1+2+3+4
    }
    println(sum)  //sum = 10

    println("-----------------")

    // คำสั่ง continue
    // หาผลรวมของตัวเลข 1-10 แต่ไม่รวมเลข 5
    var sumdata = 0
    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        sumdata += i
    }
    println(sumdata) //sum = 50

    println("-----------------")

    // การใช้ลูปแบบ do-while
    do {
        print("กรุณาใส่รหัส >> ")
        var code = readLine()
    } while (code != "1234")

    println("ขอบคุณค่ะ")


}