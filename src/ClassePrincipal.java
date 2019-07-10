


public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        lookAndFeel();
//        freLogin logar = new freLogin ();
//        logar.setVisible(true);
        double vlor = Descontos(100,0); 
        System.out.println(vlor);
    }
     public static double Descontos(double preco,double desc){
         desc=desc/100;
        double resultado=preco*desc;
        return preco-resultado;
         
    }
//     private static void lookAndFeel() {
//
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            JFrame.setDefaultLookAndFeelDecorated(true);
//            JDialog.setDefaultLookAndFeelDecorated(true);
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
//            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//    }
    
}
