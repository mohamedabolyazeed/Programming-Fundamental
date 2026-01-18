public class XMLToJSONAdapter implements JSONAnalytics {
  private XMLStockData xmlStockData;

  public XMLToJSONAdapter(XMLStockData xmlStockData) {
    this.xmlStockData = xmlStockData;
  }

  @Override
  public void processJSON(String jsonData) {
    String xmlData = xmlStockData.getXMLData();
    String jsonDataConverted = convertXMLToJSON(xmlData);

    new AnalyticsLibrary().processJSON(jsonDataConverted);
  }

  private String convertXMLToJSON(String xmlData) {
    return "{ \"stocks\": [ { \"symbol\": \"APPL\", \"price\": 175 } ] }";
  }
}
