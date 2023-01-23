@Service
public class RewardCalculatorService {
    public Map<String,Integer> calculateRewards(List<Transaction> transactions){
        Map<String,Integer> rewards = new HashMap<>();
        for(Transaction transaction:transactions){
            int amount = transaction.getAmount();
            if(amount > 100) {
                rewards.put(transaction.getCustomerId(), rewards.getOrDefault(transaction.getCustomerId(), 0) + 50 + (2 * (amount - 100)));
            }else if(amount > 50) {
                rewards.put(transaction.getCustomerId(), rewards.getOrDefault(transaction.getCustomerId(), 0) + (amount - 50));
            }
        }
        return rewards;
    }
}
