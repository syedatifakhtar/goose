package com.gravity.goose

import org.junit.Test
import org.junit.Assert._

class GooseTest {

  @Test
  def gooseTest() {


    //    implicit val config = new Configuration
    //    val url = "http://techcrunch.com/2011/08/13/2005-zuckerberg-didnt-want-to-take-over-the-world/"
    //    val goose = new Goose(config)
    //    val article = goose.extractContent(url)
    //
    //    println("\nFINAL TALLY")
    //    println("\nTEXT: \n" + article.cleanedArticleText)
    //    println("\nIMAGE: "+ article.topImage.getImageSrc)
    //
    //    val url2 = "http://www.readwriteweb.com/archives/hewlett-packard_kills_webos_devices_to_save_webos.php"
    //    val article2 = goose.extractContent(url2)
    //
    //    println("\nFINAL TALLY")
    //    println("\nTEXT: \n" + article2.cleanedArticleText)
    //    println("\nIMAGE: "+ article2.topImage.getImageSrc)

  }

//  @Test(expected = Exception.class)
//  def badlink() {
//    implicit val config = new Configuration
//    val url = "http://nolove888.com/2011/08/13/LINKNOTEXISTS"
//    val goose = new Goose(config)
//    val article = goose.extractContent(url)
//    assertNull(article.topNode)
//  }

  @Test
  def extractJSPageSource(): Unit = {
    implicit val config = new Configuration
    val url = "https://www.quora.com/Natural-Language-Processing/Where-can-I-find-a-free-offline-summarization-tool"
    val goose = new Goose(config)
    val article = goose.extractContent(url)
    println( "Article Meta: " + article.metaKeywords )
    println( "Article Text: " + article.cleanedArticleText )
    println( "Article Add: " + article.additionalData )
  }

}