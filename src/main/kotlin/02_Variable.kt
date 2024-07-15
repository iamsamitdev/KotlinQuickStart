fun kVariable() {
    // var ชื่อตัวแปร: ชนิดข้อมูล
    // val ชื่อตัวแปร: ชนิดข้อมูล
    // การประกาศตัวแปรแบบ var สามารถเปลี่ยนค่าได้
    // Mutable variable
    var x: Int = 10
    x = 20

    var result: Double
    result = 100.50

    var str: String = "Hello, Kotlin"
    str = "สวัสดี, โคตลิน"

    // var a, b, c: Int = 10 // error

    println("x = $x")
    println("result = $result")
    println("str = $str")

    // การกำหนดค่าคงที่ Immutable ( ไม่สามารถเปลี่ยนค่าได้)
    val pi: Float = 3.141f
    // pi = 3.15 // Error
    val pricePerUnit: Short = 1000
    val lat: Double
    val lon: Double
    lat = 100.12345
    lon = 80.67890
    // lon = 80.00 // Error
    println(pi)
    println(pricePerUnit)
    println(lat)
    println(lon)

    // การสร้างตัวแปรจะไม่สามารถเก็บค่า null ได้
     var name: String? = null // Error
    val age: Int? = null // Error

    val temperature = 50
    val isHot = if (temperature > 40) true else false
    println(isHot)

}