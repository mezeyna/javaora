package denesmelinda_20171011;

// @author Dénes Melinda
 

     class verem_20171011 extends Exception {

        public verem_20171011(String hibauzenet) {
            super(hibauzenet);
        }

    }

    public class Verem {

        private final static int MERET = 3; // A verem mérete
        private int[] verem = new int[MERET]; // a verem
        private int mutato = 0; // veremmutató

        public void betesz(int i) throws verem_20171011 {
            if (mutato < MERET) 
            {
                verem[mutato] = i; //a szem elhelyezése a vermben
                mutato++;
            } else
            {
                throw new verem_20171011("A verem megtelt");
            }
        }

        public int kivesz() throws verem_20171011 
        {
            if (mutato == 0) 
            {
                throw new verem_20171011("A verem üres");
            }
            mutato--;
            int i = verem[mutato];
            System.out.println("A szám (" + i + ") a veremből kivéve!");
            return i;

        }
    

    public static void main(String[] args) throws verem_20171011
    {
        Verem v = new Verem();
        v.betesz(21);
    }
    }

