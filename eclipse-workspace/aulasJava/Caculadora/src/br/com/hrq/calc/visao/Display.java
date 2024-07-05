package br.com.hrq.calc.visao;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.hrq.calc.modelo.Memoria;
import br.com.hrq.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display  extends JPanel implements MemoriaObservador {
	
	private final JLabel label;
	
	
	public Display() {		
		Memoria.getInstancia().adicionaObservador(this);
		
		setBackground(new Color(69, 69, 69));
		label = new JLabel(Memoria.getInstancia().getTextoAtual()); 
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier",Font.BOLD,30));	
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,25));
		add(label);
		
	}
	
	@Override
	public void valorAlterado(String novoValor) {
			label.setText(novoValor);
		
	}
}
