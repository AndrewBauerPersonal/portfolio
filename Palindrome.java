<!DOCTYPE html>
<html>
<head>
  <title>PLU Submission System</title>
      <link rel="stylesheet" media="all" href="/submit/assets/code_view-62770d0b2da38ded1e12f73dfd50dbe3c23d4898902a1e05f04186c91cdc4e9f.css" />
        <script src="/submit/assets/code_view_student-9252d12b179f2b288d80718ebcf5fb23a54719fed3ca585b8cbf852f55d43470.js"></script>

  <meta name="csrf-param" content="authenticity_token" />
<meta name="csrf-token" content="KTvDdFa01fWq7Tj5vAGazQJvVHxFEADJoIO/rHqDTV7viYTqrfwAoWlZxMvQdMEK2bGnWUKpMj9gEqR4HGTyHA==" />
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark fixed-top bg-dark">
<a class="navbar-brand" href="/submit/courses">PLU Submission System</a>

<button class="navbar-toggler" type="button" data-toggle="collapse"
  data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" 
  aria-expanded="false" aria-label="Toggle navigation">
  <span class="navbar-toggler-icon"></span>
</button>

  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
    </div>
  </div>
  <span class="navbar-text mr-3">
      andrew.bauer
  </span>
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="btn btn-sm btn-outline-warning" href="/submit/auth/logout">Log Out</a>
    </li>
  </ul>
</nav>


<div id="navbar-spacer"></div>

<div id="course-nav" class="container-fluid">
  <div class="container">
    <div class="row">
      <div class="col-8"><h4 class="mb-3">CS 144 - Section 1 (08:00-9:05) -- Spring, 2020</h4></div>
      <div class="col-4 text-right">
      </div>
    </div>

    <div>
      <ul class="nav nav-tabs" id="course-tabs">
        <li class="nav-item">
          <a class="nav-link" href="/submit/courses/277/submissions/upload">Upload</a>
        </li>
      </ul>
    </div>
  </div>
</div>

<main role="main" class="container">

<div class="my-2" style="font-size: 90%"><a href="/submit/submissions/31825"><i class="fas fa-arrow-circle-left"></i> Back to file list</a></div>

<div class="code-listing">
<div class="code-listing-head">
  <div class="head-right">
    Mar 24 2020  2:24 pm
  </div>

  <span class="h4">Palindrome.java</span>
  (andrew.bauer, Lab 4 - Word Play)
</div>
<table class="code highlight">
<tr id="L1"><td class="line-num">1</td><td class="line-content"><span class="cm">/*</span></td></tr><tr id="L2"><td class="line-num">2</td><td class="line-content"><span class="cm">Name: Andrew Bauer</span></td></tr><tr id="L3"><td class="line-num">3</td><td class="line-content"><span class="cm"> Assignment: 04</span></td></tr><tr id="L4"><td class="line-num">4</td><td class="line-content"><span class="cm"> Title: Palindrome.java</span></td></tr><tr id="L5"><td class="line-num">5</td><td class="line-content"><span class="cm"> Course: CS 144</span></td></tr><tr id="L6"><td class="line-num">6</td><td class="line-content"><span class="cm"> Class section: 01</span></td></tr><tr id="L7"><td class="line-num">7</td><td class="line-content"><span class="cm"> Lab Section: 01</span></td></tr><tr id="L8"><td class="line-num">8</td><td class="line-content"><span class="cm"> Semester: Spring 2020</span></td></tr><tr id="L9"><td class="line-num">9</td><td class="line-content"><span class="cm"> Instructor: Renzhi Cao</span></td></tr><tr id="L10"><td class="line-num">10</td><td class="line-content"><span class="cm"> Date: 3/19/20</span></td></tr><tr id="L11"><td class="line-num">11</td><td class="line-content"><span class="cm"> Sources consulted: N/A</span></td></tr><tr id="L12"><td class="line-num">12</td><td class="line-content"><span class="cm"> Known Bugs: N/A</span></td></tr><tr id="L13"><td class="line-num">13</td><td class="line-content"><span class="cm"> Program description: Detect a palindrome</span></td></tr><tr id="L14"><td class="line-num">14</td><td class="line-content"><span class="cm"> Creativity: N/A</span></td></tr><tr id="L15"><td class="line-num">15</td><td class="line-content"><span class="cm"> Instructions: Java Palindrome</span></td></tr><tr id="L16"><td class="line-num">16</td><td class="line-content"><span class="cm">*/</span></td></tr><tr id="L17"><td class="line-num">17</td><td class="line-content"></td></tr><tr id="L18"><td class="line-num">18</td><td class="line-content"><span class="kn">import</span> <span class="nn">java.util.Scanner</span><span class="o">;</span></td></tr><tr id="L19"><td class="line-num">19</td><td class="line-content"></td></tr><tr id="L20"><td class="line-num">20</td><td class="line-content"><span class="kd">public</span> <span class="kd">class</span> <span class="nc">Palindrome</span></td></tr><tr id="L21"><td class="line-num">21</td><td class="line-content"><span class="o">{</span></td></tr><tr id="L22"><td class="line-num">22</td><td class="line-content">  <span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">main</span><span class="o">(</span><span class="nc">String</span><span class="o">[]</span> <span class="n">args</span><span class="o">)</span></td></tr><tr id="L23"><td class="line-num">23</td><td class="line-content">  <span class="o">{</span></td></tr><tr id="L24"><td class="line-num">24</td><td class="line-content">    <span class="nc">String</span> <span class="n">original</span><span class="o">;</span></td></tr><tr id="L25"><td class="line-num">25</td><td class="line-content">    <span class="nc">String</span> <span class="n">reverseString</span> <span class="o">=</span> <span class="s">""</span><span class="o">;</span></td></tr><tr id="L26"><td class="line-num">26</td><td class="line-content">    <span class="kt">boolean</span> <span class="n">palindrome</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></td></tr><tr id="L27"><td class="line-num">27</td><td class="line-content"></td></tr><tr id="L28"><td class="line-num">28</td><td class="line-content">    <span class="nc">Scanner</span> <span class="n">input</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Scanner</span><span class="o">(</span><span class="nc">System</span><span class="o">.</span><span class="na">in</span><span class="o">);</span></td></tr><tr id="L29"><td class="line-num">29</td><td class="line-content"></td></tr><tr id="L30"><td class="line-num">30</td><td class="line-content"></td></tr><tr id="L31"><td class="line-num">31</td><td class="line-content">    <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"PALINDROME DETECTOR"</span><span class="o">);</span></td></tr><tr id="L32"><td class="line-num">32</td><td class="line-content">    <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">print</span><span class="o">(</span><span class="s">"Enter a string: "</span><span class="o">);</span></td></tr><tr id="L33"><td class="line-num">33</td><td class="line-content">    <span class="n">original</span> <span class="o">=</span> <span class="n">input</span><span class="o">.</span><span class="na">nextLine</span><span class="o">();</span></td></tr><tr id="L34"><td class="line-num">34</td><td class="line-content">    <span class="n">original</span> <span class="o">=</span> <span class="n">original</span><span class="o">.</span><span class="na">toLowerCase</span><span class="o">();</span></td></tr><tr id="L35"><td class="line-num">35</td><td class="line-content">    <span class="n">original</span> <span class="o">=</span> <span class="n">original</span><span class="o">.</span><span class="na">replace</span><span class="o">(</span><span class="s">" "</span><span class="o">,</span> <span class="s">""</span><span class="o">);</span></td></tr><tr id="L36"><td class="line-num">36</td><td class="line-content">    <span class="n">original</span> <span class="o">=</span> <span class="n">original</span><span class="o">.</span><span class="na">replace</span><span class="o">(</span><span class="s">"\'"</span><span class="o">,</span> <span class="s">""</span><span class="o">);</span></td></tr><tr id="L37"><td class="line-num">37</td><td class="line-content">    <span class="n">original</span> <span class="o">=</span> <span class="n">original</span><span class="o">.</span><span class="na">replace</span><span class="o">(</span><span class="s">","</span><span class="o">,</span> <span class="s">""</span><span class="o">);</span></td></tr><tr id="L38"><td class="line-num">38</td><td class="line-content">    <span class="n">original</span> <span class="o">=</span> <span class="n">original</span><span class="o">.</span><span class="na">replace</span><span class="o">(</span><span class="s">"."</span><span class="o">,</span> <span class="s">""</span><span class="o">);</span></td></tr><tr id="L39"><td class="line-num">39</td><td class="line-content"></td></tr><tr id="L40"><td class="line-num">40</td><td class="line-content">    <span class="c1">//reverse original string</span></td></tr><tr id="L41"><td class="line-num">41</td><td class="line-content">    <span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">original</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">-</span> <span class="mi">1</span><span class="o">;</span> <span class="n">i</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span><span class="o">--)</span></td></tr><tr id="L42"><td class="line-num">42</td><td class="line-content">    <span class="o">{</span></td></tr><tr id="L43"><td class="line-num">43</td><td class="line-content">      <span class="n">reverseString</span> <span class="o">=</span> <span class="n">reverseString</span> <span class="o">+</span> <span class="n">original</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></td></tr><tr id="L44"><td class="line-num">44</td><td class="line-content">    <span class="o">}</span></td></tr><tr id="L45"><td class="line-num">45</td><td class="line-content"></td></tr><tr id="L46"><td class="line-num">46</td><td class="line-content">    <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"The original string was: "</span> <span class="o">+</span> <span class="n">original</span><span class="o">);</span></td></tr><tr id="L47"><td class="line-num">47</td><td class="line-content">    <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"The original in reverse is: "</span> <span class="o">+</span> <span class="n">reverseString</span><span class="o">);</span></td></tr><tr id="L48"><td class="line-num">48</td><td class="line-content"></td></tr><tr id="L49"><td class="line-num">49</td><td class="line-content">    <span class="k">if</span><span class="o">(</span><span class="n">original</span><span class="o">.</span><span class="na">equalsIgnoreCase</span><span class="o">(</span><span class="n">reverseString</span><span class="o">)</span> <span class="o">&amp;&amp;</span></td></tr><tr id="L50"><td class="line-num">50</td><td class="line-content">    <span class="n">reverseString</span><span class="o">.</span><span class="na">equalsIgnoreCase</span><span class="o">(</span><span class="n">original</span><span class="o">))</span></td></tr><tr id="L51"><td class="line-num">51</td><td class="line-content">    <span class="o">{</span></td></tr><tr id="L52"><td class="line-num">52</td><td class="line-content">      <span class="n">palindrome</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></td></tr><tr id="L53"><td class="line-num">53</td><td class="line-content">    <span class="o">}</span></td></tr><tr id="L54"><td class="line-num">54</td><td class="line-content">    <span class="k">if</span><span class="o">(</span><span class="n">palindrome</span><span class="o">)</span></td></tr><tr id="L55"><td class="line-num">55</td><td class="line-content">    <span class="o">{</span></td></tr><tr id="L56"><td class="line-num">56</td><td class="line-content">      <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"The string entered is a palindrome."</span><span class="o">);</span></td></tr><tr id="L57"><td class="line-num">57</td><td class="line-content">    <span class="o">}</span></td></tr><tr id="L58"><td class="line-num">58</td><td class="line-content">    <span class="k">else</span></td></tr><tr id="L59"><td class="line-num">59</td><td class="line-content">    <span class="o">{</span></td></tr><tr id="L60"><td class="line-num">60</td><td class="line-content">      <span class="nc">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"The string entered is NOT a palindrome."</span><span class="o">);</span></td></tr><tr id="L61"><td class="line-num">61</td><td class="line-content">    <span class="o">}</span></td></tr><tr id="L62"><td class="line-num">62</td><td class="line-content">  <span class="o">}</span><span class="c1">// main</span></td></tr><tr id="L63"><td class="line-num">63</td><td class="line-content"><span class="o">}</span><span class="c1">// class</span></td></tr>
</table>
<div id="comment-icon" style="display: none"><i class="fas fa-comment fa-flip-horizontal"></i></div>
</div>
<script id="comments-json" type="application/json">
{
    "course_id": 277,
    "username": "andrew.bauer",
    "edit": "null",
    "delete": "null",
    "submission_id": "31825",
    "md_preview_path": "/submit/comments/md-preview",
    "comments_path": "/submit/submissions/31825/c/Palindrome.java",
    "create_comment_path": "/submit/comments",
    "file": "Palindrome.java"
}
</script>

</main>

<footer class="footer">
  <div class="container">
    <p>Submission system v.2.1.0<br>
       Pacific Lutheran University<br>
       Department of Computer Science</p>
  </div>
</footer>


</body>
</html>