void renderBanner() {
    final boolean isMacOS = platform.toUpperCase().indexOf("MAC")>-1;
    final boolean isIE = browser.toUpperCase().indexOF("IE")>-1;
    final boolean thirdCondition = wasInitialized() && resize > 0;

    if (isMacOs && isIE && thirdCondition ){
    // do something
    }
}
