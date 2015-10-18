package com.syedatifakhtar;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.css.sac.CSSException;
import org.w3c.css.sac.CSSParseException;
import org.w3c.css.sac.ErrorHandler;

public class CustomHTMLUnitDriver extends HtmlUnitDriver {

  private Logger logger = LoggerFactory.getLogger(this.getClass());
  public CustomHTMLUnitDriver(BrowserVersion version, boolean enableJavascript){
    super(version,enableJavascript);

    this.getWebClient().setCssErrorHandler(new ErrorHandler() {
      public void warning(CSSParseException e) throws CSSException {
        logger.debug("Ignoring CSS Error --->" + e.getMessage());

      }

      public void error(CSSParseException e) throws CSSException {
        logger.debug("Ignoring CSS Error --->" + e.getMessage());

      }

      public void fatalError(CSSParseException e) throws CSSException {
        logger.debug("Ignoring CSS Error --->" + e.getMessage());
      }
    });
   this.getWebClient().getOptions().setThrowExceptionOnFailingStatusCode(false);
    this.getWebClient().getOptions().setThrowExceptionOnScriptError(false);
  }
}