/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 08/03/2024
 * @brief Class Prova1
 */

package avaliacao.n1;
import java.util.*;

//Classe criada Prova1 no seguinte caminho
//C:\Users\Luís Fernando\Documents\NetBeansProjects\Teste-Netbeans\luisfernandooliveirasiqueira

public class Prova1 {

    
    // Método principal inícia a execução do aplicativo Java
    public static void main(String[] args) {
        
        //Declara as variáveis utilizadas no programa
        int opcao = 0, opcao2 = 0, qde_refrilata=0, qde_capuccino=0, 
            qde_leite_com_cafe=0, qde_cafes_vendidos;
        
        double valor_refrilata, valor_capuccino,pagamento = 0,
            valor_leite_com_cafe, valor_cafes_vendidos, pagparcial = 0, restante = 0;
        
        //Chama a classe scanner para obter entrada a partir da janela de comando
       
        Scanner ler = new Scanner(System.in);
        
        // Laço de repetição do tipo repita até (do while)
        // Solicita o usuário uma opção de bebida
        // Incrementa à bebida escolhida até o usuário pedir a conta (digitar a opção totalizar venda)
        // Utiliza estrutura condicional para incremantar
        
        do { 
        
                System.out.println("Forneça uma opção: \n"+
                                    "1 ­ refrigerante lata; \n"+
                                    "2 ­ café capuccino; \n"+
                                    "3 ­ leite com café; \n"+
                                    "4 ­ totalizar vendas;");
      
                opcao = ler.nextInt();
      
                if ( opcao == 1 ) qde_refrilata++;
                else if (opcao == 2) qde_capuccino++;
                else if (opcao == 3) qde_leite_com_cafe++;
                else if (opcao != 4) System.out.println("Opção inválida");
      
        } while ( opcao != 4); // Fim do laço while
    
        //Realiza a cálculo do valor individual de cada bebida, bem como o valor  total da venda
        valor_refrilata = qde_refrilata*3.5;
        valor_capuccino = qde_capuccino;    
        valor_leite_com_cafe = qde_leite_com_cafe*1.25;     
        qde_cafes_vendidos = qde_refrilata + qde_capuccino + qde_leite_com_cafe;
        valor_cafes_vendidos = valor_refrilata + valor_capuccino + valor_leite_com_cafe;
        
        // Imprime na tela o valor individual de cada bebida, bem como o valor  total da venda
        System.out.println("Qde refrigerante lata: "+qde_refrilata+" ­ valor: "+valor_refrilata);
        System.out.println("Qde café capuccino: "+qde_capuccino+" ­ valor: "+valor_capuccino);    
        System.out.println("Qde leite com café: "+qde_leite_com_cafe+
                            " ­ valor: "+valor_leite_com_cafe);

        
        System.out.println("Qde cafés vendidos: "+ qde_cafes_vendidos +
                            " ­ valor cafés vendidos: "+valor_cafes_vendidos);
        
             do { 
        
                System.out.println("Deseja realizar o pagamento parcial \n"+
                                    "1 ­ Sim; \n"+
                                    "2 ­ Não; \n");
      
                opcao2 = ler.nextInt();
      
                if ( opcao2 == 1 ) {
                
                System.out.println("Informe o valor a ser pago");
                    
                pagparcial = ler.nextDouble();
                
                pagamento = pagamento + pagparcial;
                                              
                restante = valor_cafes_vendidos - pagamento;
                
                System.out.println("Ainda faltam: R$ " + restante + " reais");
                }
                
                else if (opcao2 == 2){
                        
                pagamento = valor_cafes_vendidos;
                
                }
               else if (opcao2 != 1 && opcao2 != 2){
                
               System.out.println("Opção Inválida");
                       
                }
                
        } while (pagamento != valor_cafes_vendidos); // Fim do laço while   
        
        System.out.println("Pagamento total realizado. Volte Sempre ");
             
    } // Fim do método principal

}// Fim da classe Prova1

    
    

