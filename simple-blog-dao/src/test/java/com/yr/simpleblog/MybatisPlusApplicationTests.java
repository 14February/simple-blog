package com.yr.simpleblog;


//@SpringBootTest
//@RunWith(SpringRunner.class)
public class MybatisPlusApplicationTests {

//    @Autowired  //需要配置SpringBoot包扫描，否则此处使用@Autowired会报警告
    //@Resource
//    private BlogCategoryMapper blogCategoryMapper;

    /*@Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<BlogCategoryDO> userList = blogCategoryMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        System.out.println("----- insert method test ------");
        BlogCategoryDO blogCategoryDO = new BlogCategoryDO();
        blogCategoryDO.setCategoryName("测试分类");
        int insertId = blogCategoryMapper.insert(blogCategoryDO);
        System.out.println(insertId);
    }

    @Test
    public void testUpdate(){
        System.out.println("----- update method test ------");
        BlogCategoryDO blogCategoryDO = new BlogCategoryDO();
        blogCategoryDO.setCategoryName("测试分类2");
        int updateId = blogCategoryMapper.updateById(blogCategoryDO);
        System.out.println(updateId);
        System.out.println(blogCategoryDO);
    }

    @Test
    public void testDelete(){
        System.out.println("----- delete method test ------");
        int deleteId = blogCategoryMapper.deleteById(1);
        System.out.println(deleteId);
    }*/
}
