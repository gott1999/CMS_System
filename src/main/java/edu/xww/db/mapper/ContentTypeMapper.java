package edu.xww.db.mapper;

import edu.xww.db.model.ContentType;
import edu.xww.db.model.ContentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentTypeMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    long countByExample(ContentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int deleteByExample(ContentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int insert(ContentType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int insertSelective(ContentType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    List<ContentType> selectByExampleWithBLOBs(ContentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    List<ContentType> selectByExample(ContentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    ContentType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int updateByExampleSelective(@Param("record") ContentType record, @Param("example") ContentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int updateByExampleWithBLOBs(@Param("record") ContentType record, @Param("example") ContentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int updateByExample(@Param("record") ContentType record, @Param("example") ContentTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int updateByPrimaryKeySelective(ContentType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int updateByPrimaryKeyWithBLOBs(ContentType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_type
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    int updateByPrimaryKey(ContentType record);
}