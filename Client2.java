package com.jmd.test.dej.factory2;

public class Client {

  public static void main(String[] args) {
    ProduitFactory produitFactory = new ProduitFactory();

    ProduitA produitA = null;

    produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
    produitA.methodeA();

    produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
    produitA.methodeA();

    produitA = produitFactory.getProduitA(3);
    produitA.methodeA();

  }
}

package com.jmd.test.dej.factory2;

public class ProduitFactory {

  public static final int TYPE_PRODUITA1 = 1;
  public static final int TYPE_PRODUITA2 = 2;

  public ProduitA getProduitA(int typeProduit) {
    ProduitA produitA = null;

    switch (typeProduit) {
      case TYPE_PRODUITA1:
        produitA = new ProduitA1();
        break;
      case TYPE_PRODUITA2:
        produitA = new ProduitA2();
        break;
      default:
        throw new IllegalArgumentException("Type de produit inconnu");
    }

    return produitA;
  }
}

package com.jmd.test.dej.factory2;

public abstract class ProduitA {

  public abstract void methodeA();
}

package com.jmd.test.dej.factory2;

public class ProduitA1 extends ProduitA {

  public void methodeA() {
    System.out.println("ProduitA1.methodeA()");
  }
}

package com.jmd.test.dej.factory2;

public class ProduitA2 extends ProduitA {

  public void methodeA() {
    System.out.println("ProduitA2.methodeA()");
  }
}