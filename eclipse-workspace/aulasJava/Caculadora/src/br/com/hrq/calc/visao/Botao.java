package br.com.hrq.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao  extends JButton{

	public Botao( String texto,Color cor) {
		setText(texto);
		setFont(new Font("courier",Font.CENTER_BASELINE,23));
		setOpaque(true);
	   setBackground(cor);
	   setBorder(BorderFactory.createLineBorder( new Color(69,69,69)));
	}
}
