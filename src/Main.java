
public class Main {

    public static void main(String[] args) {
	// write your code here



//       Koi18 koi18 = new Koi18(16,4,'u',"Карала" );
//        System.out.println(koi18.toString());
  //  Уйдун  обьектисин тузобуз
        Ui18 ui1 = new Ui18(480,6,'f',"Зоя");
        Ui18 ui2 = new Ui18( 520,5,'m',"Кашка");
        Ui18 ui3 = new Ui18( 450,5,'f',"Тамара");
        Ui18 ui4 = new Ui18(360,3,'f',"Аня");
        Ui18 ui5 = new Ui18( 600,5,'m',"Ала");
        Ui18 ui6 = new Ui18( 430,4,'f',"Алачы");
        //  Койдун  обьектисин тузобуз

        Koi18 koi1 = new Koi18( 100,4,'f',"кой1");
        Koi18 koi2 = new Koi18( 80,3,'f',"Кой2");
        Koi18 koi3 = new Koi18( 70,3,'f',"кой3");
        Koi18 koi4 = new Koi18( 90,4,'f',"кой4");


        //  Жылкынын  обьектисин тузобуз
        Jylky18 jylky1 = new Jylky18( 500,5,'f',"боз","Керкашка");
        Jylky18 jylky2 = new Jylky18( 450,4,'f',"курон","кашка");
        Jylky18 jylky3 = new Jylky18( 550,3,'f',"сары","Сары");


        // ферманын обьектисин тузуп, параметрине маанилерди берип, анан жаны ( ui, koi, jylky) маасив тузуп, толтурабызю

   //     Ferma ferma1 = new Ferma( "Кырчын","Табыш",new Ui18[]{ui1,ui2,ui3,ui4,ui5},
     //                  new Jylky18[]{jylky1,jylky2},new Koi18[]{koi1,koi2,koi3});

       // Ferma ferma2 = new Ferma( " Бостон", "Таалайбек",new Ui18[]{ui6}, new Jylky18[]{jylky3}, new Koi18[]{koi4});

        Ferma ferma1 = new Ferma( "Кырчын","Табыш",new Ui18[]{ui1,ui2,ui3,ui4,ui5},
                                 new Jylky18[]{jylky1,jylky2},new Koi18[]{koi1,koi2,koi3});

        Ferma ferma2 = new Ferma( " Бостон", "Таалайбек",new Ui18[]{ui6}, new Jylky18[]{jylky3}, new Koi18[]{koi4});

                System.out.println(" Биринчи ферма :" + ferma1);
        System.out.println(" Экинчи  ферма:" + ferma2);











    }
}
