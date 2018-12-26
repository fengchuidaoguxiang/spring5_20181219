package service;

public interface IAccountService {
    /**
     * 从指定账户转出指定金额给另一个账户
     * @param outId
     * @param inId
     * @param money
     */
    public void trans(long outId, long inId, int money);
}
