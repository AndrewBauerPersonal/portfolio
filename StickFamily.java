<!DOCTYPE html>
<html>
<head>
  <title>PLU Submission System</title>
      <link rel="stylesheet" media="all" href="/submit/assets/code_view-62770d0b2da38ded1e12f73dfd50dbe3c23d4898902a1e05f04186c91cdc4e9f.css" />
        <script src="/submit/assets/code_view_student-9252d12b179f2b288d80718ebcf5fb23a54719fed3ca585b8cbf852f55d43470.js"></script>

  <meta name="csrf-param" content="authenticity_token" />
<meta name="csrf-token" content="PQUwIlzvSat/coEqwF3dIbLbobXNxCBH/UBaQlabYdX7t3e8p6ec/7zGfRisKIbmaQVSkMp9ErE90UGWMHzelw==" />
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

<div class="my-2" style="font-size: 90%"><a href="/submit/submissions/32390"><i class="fas fa-arrow-circle-left"></i> Back to file list</a></div>

<div class="code-listing">
<div class="code-listing-head">
  <div class="head-right">
    May 12 2020 10:08 pm
  </div>

  <span class="h4">StickFamily.java</span>
  (andrew.bauer, Lab 8 - Stick Family)
</div>
<table class="code highlight">
<tr id="L1"><td class="line-num">1</td><td class="line-content"><span class="cm">/*</span></td></tr><tr id="L2"><td class="line-num">2</td><td class="line-content"><span class="cm">Name: Andrew Bauer</span></td></tr><tr id="L3"><td class="line-num">3</td><td class="line-content"><span class="cm"> Assignment: 08</span></td></tr><tr id="L4"><td class="line-num">4</td><td class="line-content"><span class="cm"> Title: StickFamily</span></td></tr><tr id="L5"><td class="line-num">5</td><td class="line-content"><span class="cm"> Course: CS 144</span></td></tr><tr id="L6"><td class="line-num">6</td><td class="line-content"><span class="cm"> Class section: 01</span></td></tr><tr id="L7"><td class="line-num">7</td><td class="line-content"><span class="cm"> Lab Section: 01</span></td></tr><tr id="L8"><td class="line-num">8</td><td class="line-content"><span class="cm"> Semester: Spring 2020</span></td></tr><tr id="L9"><td class="line-num">9</td><td class="line-content"><span class="cm"> Instructor: Renzhi Cao</span></td></tr><tr id="L10"><td class="line-num">10</td><td class="line-content"><span class="cm"> Date: 5-9-20</span></td></tr><tr id="L11"><td class="line-num">11</td><td class="line-content"><span class="cm"> Sources consulted: lab resources</span></td></tr><tr id="L12"><td class="line-num">12</td><td class="line-content"><span class="cm"> Known Bugs: N/A</span></td></tr><tr id="L13"><td class="line-num">13</td><td class="line-content"><span class="cm"> Program description: This program is used to draw the stick figures</span></td></tr><tr id="L14"><td class="line-num">14</td><td class="line-content"><span class="cm"> Creativity: N/A</span></td></tr><tr id="L15"><td class="line-num">15</td><td class="line-content"><span class="cm"> Instructions: java StickFamily</span></td></tr><tr id="L16"><td class="line-num">16</td><td class="line-content"><span class="cm">*/</span></td></tr><tr id="L17"><td class="line-num">17</td><td class="line-content"><span class="kn">import</span> <span class="nn">java.awt.Graphics</span><span class="o">;</span></td></tr><tr id="L18"><td class="line-num">18</td><td class="line-content"><span class="kd">public</span> <span class="kd">class</span> <span class="nc">StickFamily</span></td></tr><tr id="L19"><td class="line-num">19</td><td class="line-content"><span class="o">{</span></td></tr><tr id="L20"><td class="line-num">20</td><td class="line-content">  <span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">main</span><span class="o">(</span><span class="nc">String</span><span class="o">[]</span> <span class="n">args</span><span class="o">)</span></td></tr><tr id="L21"><td class="line-num">21</td><td class="line-content">  <span class="o">{</span></td></tr><tr id="L22"><td class="line-num">22</td><td class="line-content">    <span class="nc">DrawingCanvas</span> <span class="n">canvas</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">DrawingCanvas</span><span class="o">(</span><span class="mi">1500</span><span class="o">,</span><span class="mi">1500</span><span class="o">);</span></td></tr><tr id="L23"><td class="line-num">23</td><td class="line-content">    <span class="nc">Graphics</span> <span class="n">g</span> <span class="o">=</span> <span class="n">canvas</span><span class="o">.</span><span class="na">getGraphics</span><span class="o">();</span></td></tr><tr id="L24"><td class="line-num">24</td><td class="line-content">    <span class="nc">Person</span> <span class="n">homer</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Person</span><span class="o">(</span><span class="s">"Homer"</span><span class="o">,</span> <span class="mi">42</span><span class="o">,</span> <span class="mi">500</span><span class="o">);</span></td></tr><tr id="L25"><td class="line-num">25</td><td class="line-content">    <span class="n">homer</span><span class="o">.</span><span class="na">draw</span><span class="o">(</span><span class="n">g</span><span class="o">,</span> <span class="mi">200</span><span class="o">,</span> <span class="mi">500</span><span class="o">);</span></td></tr><tr id="L26"><td class="line-num">26</td><td class="line-content">    <span class="nc">Person</span> <span class="n">marge</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Person</span><span class="o">(</span><span class="s">"Marge"</span><span class="o">,</span> <span class="mi">42</span><span class="o">,</span> <span class="mi">400</span><span class="o">);</span></td></tr><tr id="L27"><td class="line-num">27</td><td class="line-content">    <span class="n">marge</span><span class="o">.</span><span class="na">draw</span><span class="o">(</span><span class="n">g</span><span class="o">,</span> <span class="mi">400</span><span class="o">,</span> <span class="mi">500</span><span class="o">);</span></td></tr><tr id="L28"><td class="line-num">28</td><td class="line-content">    <span class="nc">Person</span> <span class="n">bart</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Person</span><span class="o">(</span><span class="s">"Bart"</span><span class="o">,</span> <span class="mi">42</span><span class="o">,</span> <span class="mi">250</span><span class="o">);</span></td></tr><tr id="L29"><td class="line-num">29</td><td class="line-content">    <span class="n">bart</span><span class="o">.</span><span class="na">draw</span><span class="o">(</span><span class="n">g</span><span class="o">,</span> <span class="mi">600</span><span class="o">,</span> <span class="mi">500</span><span class="o">);</span></td></tr><tr id="L30"><td class="line-num">30</td><td class="line-content">    <span class="nc">Person</span> <span class="n">lisa</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Person</span><span class="o">(</span><span class="s">"Lisa"</span><span class="o">,</span> <span class="mi">42</span><span class="o">,</span> <span class="mi">200</span><span class="o">);</span></td></tr><tr id="L31"><td class="line-num">31</td><td class="line-content">    <span class="n">lisa</span><span class="o">.</span><span class="na">draw</span><span class="o">(</span><span class="n">g</span><span class="o">,</span> <span class="mi">800</span><span class="o">,</span> <span class="mi">500</span><span class="o">);</span></td></tr><tr id="L32"><td class="line-num">32</td><td class="line-content">    <span class="nc">Person</span> <span class="n">maggie</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Person</span><span class="o">(</span><span class="s">"Maggie"</span><span class="o">,</span> <span class="mi">42</span><span class="o">,</span> <span class="mi">100</span><span class="o">);</span></td></tr><tr id="L33"><td class="line-num">33</td><td class="line-content">    <span class="n">maggie</span><span class="o">.</span><span class="na">draw</span><span class="o">(</span><span class="n">g</span><span class="o">,</span> <span class="mi">1000</span><span class="o">,</span> <span class="mi">500</span><span class="o">);</span></td></tr><tr id="L34"><td class="line-num">34</td><td class="line-content">  <span class="o">}</span></td></tr><tr id="L35"><td class="line-num">35</td><td class="line-content"><span class="o">}</span></td></tr>
</table>
<div id="comment-icon" style="display: none"><i class="fas fa-comment fa-flip-horizontal"></i></div>
</div>
<script id="comments-json" type="application/json">
{
    "course_id": 277,
    "username": "andrew.bauer",
    "edit": "null",
    "delete": "null",
    "submission_id": "32390",
    "md_preview_path": "/submit/comments/md-preview",
    "comments_path": "/submit/submissions/32390/c/StickFamily.java",
    "create_comment_path": "/submit/comments",
    "file": "StickFamily.java"
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