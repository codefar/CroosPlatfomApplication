/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/8/3
 * time: 13:59
 */
class Main {

    enum class Direction {
        NORTH, SOUTH, WEST, EAST
    }

    enum class Color(val rgb: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }
}