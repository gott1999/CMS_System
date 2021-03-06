package edu.xww.db.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
public class ContentArticle extends BaseModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.type_id
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private Integer typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.content_template
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private Integer contentTemplate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.article_name
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private String articleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.article_thumb
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private String articleThumb;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.article_author
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private String articleAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.article_time
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private Date articleTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.article_click
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private Integer articleClick;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.article_title
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private String articleTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.article_keywords
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private String articleKeywords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.article_description
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private String articleDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.article_flag
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private String articleFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_article.article_content
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    private String articleContent;
}