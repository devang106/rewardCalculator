@RestController
public class RewardController {

    @Autowired
    private RewardCalculatorService rewardCalculatorService;

    @PostMapping("/calculate-rewards")
    public Map<String,Integer> calculateRewards(@RequestBody List<Transaction> transactions){
        return rewardCalculatorService.calculateRewards(transactions);
    }
}
