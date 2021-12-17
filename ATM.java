public  class ATM{
public int countBanknotes(int sum) {
        int[] banknotesList = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int index = 0;
        int count = 0;
        while (sum!=0){
            if (sum>=banknotesList[index]){
                sum-=banknotesList[index];
                count++;}
          else {index++;}
            }
        
        return count;
    }
}
