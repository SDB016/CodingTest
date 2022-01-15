class Prime{
    private boolean isPrime(int num) {
        if(num==2) return true;
        else if(num==0 || num==1 || num%2==0) return false;
        for(int i = 3; i <= (int)Math.sqrt(num); i+=2) {
            if(num%i==0) return false;
        }
        return true;
    }
}
