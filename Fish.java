// 1 machhli pani me gayi chappak
// 2 machhli 2 machhli pani me gayi pani me gayi chappak chappak
// 3 machhli 3 machhli3 machhli pani me gayi pani me gayi pani me gayi chappak chappak chappak
// 4 machhli 4 machhli4 machhli 4 machhli pani me gayi pani me gayi pani me gayi pani me gayi chappak chappak chappak chappak
// 5 machhli 5 machhli5 machhli 5 machhli5 machhli pani me gayi pani me gayi pani me gayi pani me gayi pani me gayi chappak chappak chappak chappak chappak
class Main {
    public static void main(String args[]) {
        for(int i = 1; i <= 5; i++) {

                for(int j = 0; j < i; j++) 
                    System.out.print(i + " machhli");

                for(int j = 0; j < i; j++) 
                    System.out.print(" pani me gayi");

                for(int j = 0; j < i; j++) 
                    System.out.print(" chappak");
                
                System.out.println();
        }
    }
}