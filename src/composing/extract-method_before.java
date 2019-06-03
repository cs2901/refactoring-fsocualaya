void printOwing() {
    printBanner();
    printDetails(getOutstanding());
  // Print details.
}

void printDetails(double outstanding){
    System.out.println("name: " + name);
    System.out.println("amount: " + outstanding);
}