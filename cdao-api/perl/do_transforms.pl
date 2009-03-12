#!/usr/bin/perl -w
#Script to automate doing transformations
#12 March 2009
#CDAO API Team
#Set Defaults.
my $testdir = "../examples/source";
my $outdir  = "../examples/rdf";
my $xsltdir = "../xslt";
my $xsltscript = "roger_messing.xsl";
my $xsltprocessor = "xsltproc";
#Process Arguments
for (my $i = 0; $i < scalar (@ARGV) - 1; ++$i){
    if ($ARGV[$i] =~ m/^--input-dir$/){ $testdir = $ARGV[$i + 1]; }
    elsif ($ARGV[$i] =~ m/^--output-dir$/){ $outdir = $ARGV[$i + 1]; }
    elsif ($ARGV[$i] =~ m/^--xslt-path$/){ $xsltdir = $ARGV[$i + 1]; }
    elsif ($ARGV[$i] =~ m/^--xslt-script$/){ $xsltscript = $ARGV[ $i + 1]; }
    elsif ($ARGV[$i] =~ m/^--xslt-processor$/){ $xsltprocessor = $ARGV[$i + 1]; }
}
#Setup command
my $xsltcommand = "$xsltprocessor $xsltdir/$xsltscript";
my $testfilesstr = `cd $testdir && ls`;
chomp $testfilesstr;
my @splitfiles = split /[^-_.:()a-zA-Z0-9]/, $testfilesstr;
#Do the transformations
foreach my $file (@splitfiles){
	if ($file){
		print "Running: $xsltcommand $testdir/$file > $outdir/$file.rdf\n";	
	        system( "$xsltcommand $testdir/$file > $outdir/$file.rdf" );
       }
}

