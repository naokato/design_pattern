public class Main {
  public static void main(String[] args) {
    TicketMaker ticketMaker = TicketMaker.getInstance();
    System.out.println(ticketMaker.getNextTicketNumber());
    System.out.println(ticketMaker.getNextTicketNumber());
    System.out.println(ticketMaker.getNextTicketNumber());

    TicketMaker ticketMaker2 = TicketMaker.getInstance();
    System.out.println(ticketMaker2.getNextTicketNumber());
  }
}
