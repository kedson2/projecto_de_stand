/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author kedson dos Anjos
 */
public class Validarcampo {

    

    public class So_numeros extends PlainDocument {

        @Override
        public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
            super.insertString(i, string.replaceAll("[^0-9]", ""), as);
        }

    }

    public class So_letras extends PlainDocument {

        @Override
        public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
            super.insertString(i, string.replaceAll("[^a-z|^A-Z]", ""), as);
        }


    }
}
