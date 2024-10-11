import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.stream.FileCacheImageInputStream;
import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

public class Program {

	public static void main(String[] args) {
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
        	//Lecture du fichier
        	fr = new FileReader("C:\\Users\\IB\\eclipse-workspace\\PremierProjet\\src\\test.txt");
        	br = new BufferedReader(fr);
        	
        	String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
            }
        }catch (IOException e) {
			e.printStackTrace();
		}finally {
			//Fermeture du fichier
			if(br != null) {
				try {
					br.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(fr != null) {
				try {
					br.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
//		TeamLeader tl = new TeamLeader("Wellyson", "DOS SANTOS", 25, "Chef d'entreprise", 7000, "Président", 3000);
//		tl.afficherTeamLeader();
		
//		Runtime run = Runtime.getRuntime();
//		
//		
//		
//		try {
//			run.exec("notepaad.exe -sdsd");
////			Integer.parseInt("hello");
////			int a = 3/0;
//		} catch (IOException e) {
////			System.err.println(e);
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.err.println(e);
//		} finally {
//			System.out.println("Arrivé dans le finally");
//		}
//		
//		FileInputStream fichier = null;
//		
//		try {
//			fichier = new FileInputStream("test.txt");
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (fichier != null) {
//				try {
//					fichier.close();
//				} catch (Exception e2) {
//					e2.printStackTrace();
//				}
//			}
//		}
		

	}

}


