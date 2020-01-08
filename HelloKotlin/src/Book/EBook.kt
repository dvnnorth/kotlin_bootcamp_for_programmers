package Book

class EBook(pages: Int, var format: String = "text") : Book(pages = pages) {
  private var wordCount = 0
  override fun readPage() {
    wordCount += 250
  }
}