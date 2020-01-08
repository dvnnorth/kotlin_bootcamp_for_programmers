package Book

open class Book(val pages: Int) {
  private var place = 0
  open fun readPage() {
    place += 1
  }
}