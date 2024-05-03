Smarter way to handle structure pieces

**____________________________________________________________________________**

# MAVEN

For developers that want to add CommandStructures to their mod's workspace:

<blockquote>repositories {

&nbsp; maven {

&nbsp; &nbsp; url "https://nexus.resourcefulbees.com/repository/maven-public/"

&nbsp; }

}</blockquote>

&nbsp;

Don't forget to change &lt;modversion> with the actual latest version of this mod.

<blockquote>dependencies {


&nbsp; ...


&nbsp; implementation fg.deobf("com.telepathicgrunt:CommandStructures-Fabric:&lt;modversion>+1.20.6")


}</blockquote>

