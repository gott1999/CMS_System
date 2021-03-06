package edu.xww.db.mapper;

import edu.xww.db.model.SystemLink;
import edu.xww.db.model.SystemLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemLinkMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_link
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    long countByExample(SystemLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_link
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int deleteByExample(SystemLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_link
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_link
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int insert(SystemLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_link
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int insertSelective(SystemLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_link
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    List<SystemLink> selectByExample(SystemLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_link
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    SystemLink selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_link
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int updateByExampleSelective(@Param("record") SystemLink record, @Param("example") SystemLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_link
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int updateByExample(@Param("record") SystemLink record, @Param("example") SystemLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_link
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int updateByPrimaryKeySelective(SystemLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_link
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int updateByPrimaryKey(SystemLink record);
}