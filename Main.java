/*
Lab 10
Me: Tanner Daria. Partner: Alex Hils.
Date: 11/23
*/

class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar("tree");

    tree.cutOut(tree.getShape(), 10);

    tree.bakeCookies(350, 12);

    tree.decorate();

    Sugar aCookie = new Sugar();

    aCookie.decorate();

  }
}