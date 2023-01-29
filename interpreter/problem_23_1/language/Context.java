package language;

public class Context implements ExecutorFactory {
  // 実際の処理を行う Executor は、与らえた Factory を用いて生成する (委譲)
  private ExecutorFactory factory;
  private String[] tokens;
  private String lastToken;
  private int index;

  public Context(String text) {
    this.tokens = text.split("\\s+");
    this.index = 0;
    nextToken();
  }

  public String nextToken() {
    if (index < tokens.length) {
      lastToken = tokens[index++] ;
    } else {
      lastToken = null;
    }
    return lastToken;
  }

  public String currentToken() {
    return lastToken;
  }

  public void skipToken(String token) throws ParseException {
    if(currentToken() == null) {
      throw new ParseException("Error: '" + token + "' is expected, but no more token is found.");
    } else if (!token.equals(currentToken())) {
      throw new ParseException("Error: '" + token + "' is expected, but '" + currentToken() + "' is found.");
    }
    nextToken();
  }

  public int currentNumber() throws ParseException {
    if (currentToken() == null) {
      throw new ParseException("Error: no more token.");
    }
    int number = 0;
    try {
      number = Integer.parseInt(currentToken());
    } catch (NumberFormatException e) {
      throw new ParseException("Error: " + e);
    }
    return number;
  }

  public void setExecutorFactory(ExecutorFactory factory) {
    this.factory = factory;
  }

  @Override
  public Executor createExecutor(String name) {
    // factory に委譲
    return factory.createExecutor(name);
  }
}
