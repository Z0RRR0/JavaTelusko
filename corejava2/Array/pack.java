

// class GameDetail
// {
//     int score;
//     String name;
//     int userID;
//     double kd;  
// }

// class pack
// {
//     public static void main(String[] args)
//     {

//         GameDetail detail1 = new GameDetail();
//         detail1.score = 89;
//         detail1.name = "Luffy";
//         detail1.userID = 0001;
//         detail1.kd = 9.5;

//         GameDetail detail2 = new GameDetail();
//         detail2.score = 77;
//         detail2.name = "Zoro";
//         detail2.userID = 0002;
//         detail2.kd = 13.5;

//         GameDetail detail3 = new GameDetail();
//         detail3.score = 85;
//         detail3.name = "Sanji";
//         detail3.userID = 0003;
//         detail3.kd = 10.5;

//         GameDetail detail4 = new GameDetail();
//         detail4.score = 94;
//         detail4.name = "Chopper";
//         detail4.userID = 0004;
//         detail4.kd = 2.5;

//         GameDetail detail5 = new GameDetail();
//         detail5.score = 100;
//         detail5.name = "Nami";
//         detail5.userID = 0005;
//         detail5.kd = 2.65;

//         GameDetail headings = new GameDetail();
//         String a= "score";
//         String b= "name";
//         String c= "userID";
//         String d= "kd";

//         System.out.println(a + " " + b + " " + c + " " + d);
        

//         GameDetail details[] = new GameDetail[5];
//         details[0] = detail1;
//         details[1] = detail2;
//         details[2] = detail3;
//         details[3] = detail4;
//         details[4] = detail5;


//         for(int i = 0; i<details.length; i++)
//         {
//             System.out.println(details[i].score + "    " + details[i].name + " " + details[i].userID + " " + details[i].kd);
//         }
        
//     }
// }






class Gamers
{
    String name;
    String username;
    int userID;
    double kd;
    int points;
}

class pack
{
    public static void main(String args[])
    {
        
        Gamers gamer1 = new Gamers();
        gamer1.name = "Tushar";
        gamer1.username = "Luffy";
        gamer1.userID = 1;
        gamer1.kd = 5;
        gamer1.points = 99;

        Gamers gamer2 = new Gamers();
        gamer2.name = "Sanjeev";
        gamer2.username = "Sanju";
        gamer2.userID = 2;
        gamer2.kd = 4.5;
        gamer2.points = 95;

        Gamers gamer3 = new Gamers();
        gamer3.name = "Kunal";
        gamer3.username = "InsaneKiller";
        gamer3.userID = 3;
        gamer3.kd = 4.7;
        gamer3.points = 97;

         Gamers gamer4 = new Gamers();
        gamer4.name = "Kritika";
        gamer4.username = "SavageGirl";
        gamer4.userID = 4;
        gamer4.kd = 2.5;
        gamer4.points = 92;

        String tags[] = new String[5];
        tags[0] = "name";
        tags[1]= "username";
        tags[2] = "userID";
        tags[3] = "kd";
        tags[4] = "points";

        Gamers gamers[] = new Gamers[4];
        gamers[0] = gamer1;
        gamers[1] = gamer2;
        gamers[2] = gamer3;
        gamers[3] = gamer4;
        
        for(int i = 0; i<tags.length; i++)
        {
            System.out.println(tags[i] + "   ");
            for(int j = 0; j<gamers.length; j++)
            {
                System.out.print(gamers[j].name + " ");
            }
        }

        // for(int j = 0; j<gamers.length; j++)
        //     {
        //         System.out.println(gamers[j].name + " " + gamers[j].username + " " + gamers[j].userID + " " + gamers[j].kd + " " + gamers[j].points);
        //     }

        // Gamers gamers[][] = new Gamers[][];


    }
}