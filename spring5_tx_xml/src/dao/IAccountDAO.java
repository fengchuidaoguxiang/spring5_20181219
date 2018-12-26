package dao;

public interface IAccountDAO {
    /**
     * 从指定账户转出多少钱
     * @param outId
     * @param money
     */
    public void transOut(long outId, int money);

    /**
     * 从指定账户转入多少钱
     * @param inId
     * @param money
     */
    public void transIn(long inId, int money);
}
