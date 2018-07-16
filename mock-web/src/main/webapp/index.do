# tomcat服务器中设置.do等地址为首页的方法

众所周知，在java web程序中，可以利用web.xml设置网站首页，如：

<welcome-file-list> 
  <welcome-file>index.jsp</welcome-file> 
</welcome-file-list>

但是如果我们的首页需要加载数据，通过struts的action、Spring mvc等框架实现的首页，这样设置就不行了。如配置：

<welcome-file>index.do</welcome-file>

index.do是自己实现的一个Action或者controller。这样访问时会提示404错误。并不会按照我们想象的直接访问index.do。

其实welcome-file这个标记本身就能说明问题，因为它让你指定的是file,而不是“page”，所以这个地址必须为一个实际存在的文件。

有很多人说直接在index.jsp里forword或者redirect到index.do就可以了，这样做倒是能大概实现，但是用户感觉多少有些奇怪。

如何这个问题解决呢？其实超级简单。只要建立一个空文件就可以了。如我们要设置首页为struts的index.do为首页，直接配置

<welcome-file>index.do</welcome-file>
然后在web根目录创建一个index.do的空文件即可。

有人可能疑惑会不会直接访问到这个空文件里，答案是根本不会。如strtuts1中，dipatcherservlet的servlet mappting为/*.do,这样所有.do请求都会被拦截，由strtus处理，也就会直接访问真正的index.do这个action了。

有了这个空文件，同样也可以在apache的DirectoryIndex里配置首页了。原理是一样的