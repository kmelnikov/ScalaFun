/**
 * User: km
 * Date: 11/22/13
 * Time: 12:05 AM
 */

def sig(x: Int) = if (x > 0) 1 else if (x < 0) -1 else 0

sig(-10) == -1
sig(889) == 1
sig(0) == 0


def countdown(n: Int) {
  for (i <- n to 0 by -1) println(i)
}
//countdown(10)

def product(s: String) = s.foldLeft(1L)(_ * _.toInt)

def pr(s: String): Long = {
  if (s.isEmpty)
    1
  else
    s(0).toLong * pr(s.tail)
}
product("Hello") == pr("Hello")

def power(x: Long, y: Long): Long = {
  if (y == 0)
    1
  else
  if (y % 2 == 1)
    x * power(x, y - 1)
  else {
    val p = power(x, y / 2)
    p * p
  }
}

def p(x: Long, y: Long) = {
  if (y < 0) 1 / power(x, -1 * y)
  else power(x, y)
}

power(2, 2) == 4
p(2, -1) == 1 / 2






