public enum Hand {
  ROCK("グー", 0),
  SCISSORS("チョキ", 1),
  PAPER("パー", 2);

  private String name;
  private int handvalue;

  private static Hand[] hands = {
    ROCK, SCISSORS, PAPER
  };

  private Hand(String name, int handvalue) {
    this.name = name;
    this.handvalue = handvalue;
  }

  // Static Factory Method Pattern
  // Singleton Pattern
  public static Hand getHand(int handvalue) {
    return hands[handvalue];
  }

  public boolean isStrongerThan(Hand h) {
    return fight(h) == 1;
  }

  public boolean isWeakerThan(Hand h) {
    return fight(h) == -1;
  }
  
  private int fight(Hand h) {
    // Because Hand is enum (singleton), same hands mean same instances
    if (this == h) {
      return 0;
    }
    if ((this.handvalue + 1) % 3 == h.handvalue) {
      return 1;
    }
    return -1;
  }

  @Override
  public String toString() {
    return name;
  }

  //public static void main(String[] args) {
  //  Hand rock = Hand.getHand(0);
  //  Hand scissors = Hand.getHand(1);
  //  Hand paper = Hand.getHand(2);
  //  System.out.println(rock.isStrongerThan(scissors));
  //  System.out.println(rock.isWeakerThan(scissors));
  //  System.out.println(scissors.isStrongerThan(paper));
  //  System.out.println(scissors.isWeakerThan(paper));
  //  System.out.println(paper.isStrongerThan(rock));
  //  System.out.println(paper.isWeakerThan(rock));
  //}
}
