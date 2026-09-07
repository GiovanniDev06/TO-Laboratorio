//> using scala 3.9.0

def countChange(money: Int, coins: List[Int]): Int = {
  if (money == 0) 1
  else if (money < 0) 0
  else if (coins.isEmpty) 0
  else countChange(money, coins.tail) + countChange(money - coins.head, coins)
}

@main def main(): Unit = {
  val monto = 4
  val monedas = List(1, 2)
  println(s"Formas de dar cambio para $monto con $monedas: ${countChange(monto, monedas)}")
}
