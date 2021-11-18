package edu.wisc.ischool.wiscir.examples;

public class Assignment {

	public static void main(String[] args) {
		/*
		 * original bm25 similarity 
		 */
		System.out.println("\n\n\tNow Trying BM25SimilarityOriginal");
		new LuceneBuildIndex(new BM25SimilarityOriginal()).build();;
		new LuceneSearchExample(new BM25SimilarityOriginal()).search();
		/*
		 * Boolean similarity
		 */
		System.out.println("\n\n\tNow Trying ClassicSimilarity");
		new LuceneBuildIndex(new org.apache.lucene.search.similarities.ClassicSimilarity()).build();
		new LuceneSearchExample(new org.apache.lucene.search.similarities.ClassicSimilarity()).search();
		/*
		 * AxiomaticF1EXP similarity
		 */
		 System.out.println("\n\n\tNow Trying AxiomaticF1EXP");
		 new LuceneBuildIndex(new org.apache.lucene.search.similarities.AxiomaticF1EXP()).build();
		 new LuceneSearchExample(new org.apache.lucene.search.similarities.AxiomaticF1EXP()).search();
	}

}
